package br.com.technicalshare.api.exception.handlers;

import br.com.technicalshare.api.exception.EmailNaoExistenteException;
import br.com.technicalshare.api.exception.dto.ExceptionDto;
import br.com.technicalshare.api.exception.SenhaInvalidaException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrosApi {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EmailNaoExistenteException.class)
    public ExceptionDto handlerEmailIncorreto(EmailNaoExistenteException exception) {
        ExceptionDto emailIncorreto = new ExceptionDto(exception.getMessage());
        return emailIncorreto;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(SenhaInvalidaException.class)
    public ExceptionDto handlerSenhaIncorreta(SenhaInvalidaException exception) {
        ExceptionDto emailIncorreto = new ExceptionDto(exception.getMessage());
        return emailIncorreto;
    }
}
