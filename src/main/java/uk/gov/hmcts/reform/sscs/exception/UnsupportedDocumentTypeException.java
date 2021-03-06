package uk.gov.hmcts.reform.sscs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import uk.gov.hmcts.reform.logging.exception.AlertLevel;
import uk.gov.hmcts.reform.logging.exception.UnknownErrorCodeException;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY,
        reason = "One of the given document type is not accepted by Document Store")
public class UnsupportedDocumentTypeException extends UnknownErrorCodeException {

    public UnsupportedDocumentTypeException(Throwable cause) {
        super(AlertLevel.P4, cause);
    }

}