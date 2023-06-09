    package com.example.meusgastos.handler;

    import com.example.meusgastos.common.ConversorData;
    import com.example.meusgastos.domain.exception.ResourceBadRequestException;
    import com.example.meusgastos.domain.exception.ResourceNotFoundException;
    import com.example.meusgastos.domain.model.ErrorResposta;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.ControllerAdvice;
    import org.springframework.web.bind.annotation.ExceptionHandler;

    import java.util.Date;

    @ControllerAdvice
    public class RestExceptionHandler {
        @ExceptionHandler (ResourceNotFoundException.class)
        public ResponseEntity<ErrorResposta> handlerResourceNotFoundException(ResourceNotFoundException ex) {

            String dataHora = ConversorData.converterDateParaDataEHora(new Date());

            ErrorResposta erro = new ErrorResposta(
                    dataHora,
                    ex.getMessage(),
                    "Not Found",
                    HttpStatus.NOT_FOUND.value());

            return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
        }

        @ExceptionHandler (ResourceBadRequestException.class)
        public ResponseEntity<ErrorResposta> handlerResourceBadRequestException(ResourceBadRequestException ex) {

            String dataHora = ConversorData.converterDateParaDataEHora(new Date());

            ErrorResposta erro = new ErrorResposta(
                    dataHora,
                    ex.getMessage(),
                    "Bad Request",
                    HttpStatus.BAD_REQUEST.value());

            return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
        }

        @ExceptionHandler (Exception.class)
        public ResponseEntity<ErrorResposta> handlerRequestException(Exception ex) {

            String dataHora = ConversorData.converterDateParaDataEHora(new Date());

            ErrorResposta erro = new ErrorResposta(
                    dataHora,
                    ex.getMessage(),
                    "Internal Server Error",
                    HttpStatus.INTERNAL_SERVER_ERROR.value());

            return new ResponseEntity<>(erro, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


