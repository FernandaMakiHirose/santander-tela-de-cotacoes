package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

/*criando um construtor que recebe a mensagem*/

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
