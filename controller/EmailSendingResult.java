package pl.jakubmarcinkowski.controller;

public enum EmailSendingResult {
    SUCCESS,
    FAILED_BY_PROVIDER,
    FAILED_BY_UNEXPECTED_ERROR;
}