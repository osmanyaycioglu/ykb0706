package com.training.ykb;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestHandlerAll {


    @ExceptionHandler(IllegalStateException.class)
    @ResponseStatus(code = HttpStatus.EXPECTATION_FAILED)
    public MyErrorObj handleError(final IllegalStateException exp) {
        //        MyErrorObj errorObjLoc = new MyErrorObj("ms1",
        //                                                exp.getMessage(),
        //                                                1001);
        MyErrorObj errorObjLoc = new MyErrorObj().setDesc(exp.getMessage())
                                                 .setErrorCause(1001)
                                                 .setMiscroservice("ms1")
                                                 .addSubErrorObj(new MyErrorObj().setDesc(exp.getMessage())
                                                                                 .setErrorCause(1001)
                                                                                 .setMiscroservice("ms2"));
        return errorObjLoc;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public MyErrorObj handleError(final IllegalArgumentException exp) {
        MyErrorObj errorObjLoc = new MyErrorObj().setDesc(exp.getMessage())
                                                 .setErrorCause(1001)
                                                 .setMiscroservice("ms1");
        return errorObjLoc;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorObj> handleError(final Exception exp) {
        if (exp instanceof IllegalThreadStateException) {
            IllegalThreadStateException exceptionLoc = (IllegalThreadStateException) exp;
            return ResponseEntity.status(800)
                                 .body(new MyErrorObj().setDesc(exceptionLoc.getMessage())
                                                       .setErrorCause(1002)
                                                       .setMiscroservice("ms1"));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body(new MyErrorObj().setDesc(exp.getMessage())
                                                       .setErrorCause(100)
                                                       .setMiscroservice("ms1"));

        }
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public MyErrorObj handleError(final MethodArgumentNotValidException exp) {
        BindingResult bindingResultLoc = exp.getBindingResult();
        List<ObjectError> allErrorsLoc = bindingResultLoc.getAllErrors();
        MyErrorObj errorObjLoc = new MyErrorObj().setDesc("Validasyonda problem oluştu")
                                                 .setErrorCause(2001)
                                                 .setMiscroservice("ms1");
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            errorObjLoc.addSubErrorObj(new MyErrorObj().setDesc(objectErrorLoc.getDefaultMessage())
                                                       .setErrorCause(3001)
                                                       .setMiscroservice("ms1"));
        }
        return errorObjLoc;
    }

}
