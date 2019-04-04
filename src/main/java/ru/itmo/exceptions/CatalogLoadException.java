package ru.itmo.exceptions;

public class CatalogLoadException extends Exception {
    public CatalogLoadException(Exception e) {
        initCause(e);
    }
}
