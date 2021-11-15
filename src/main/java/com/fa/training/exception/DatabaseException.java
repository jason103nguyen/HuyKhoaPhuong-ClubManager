package com.fa.training.exception;

public class DatabaseException extends Exception {

    private String codeError;
    private String msgError;

    public DatabaseException(String msgError) {
        super(msgError);
    }

    public DatabaseException(String codeError, String msgError) {
        this.codeError = codeError;
        this.msgError = msgError;
    }

    public String getCodeError() {
        return codeError;
    }

    public void setCodeError(String codeError) {
        this.codeError = codeError;
    }

    public String getMsgError() {
        return msgError;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }

    @Override
    public String toString() {
        return "DatabaseException{" +
                "codeException='" + codeError + '\'' +
                ", msgException='" + msgError + '\'' +
                '}';
    }
}
