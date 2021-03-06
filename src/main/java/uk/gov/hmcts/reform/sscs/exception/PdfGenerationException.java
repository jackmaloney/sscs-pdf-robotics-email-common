package uk.gov.hmcts.reform.sscs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import uk.gov.hmcts.reform.logging.exception.AlertLevel;
import uk.gov.hmcts.reform.logging.exception.UnknownErrorCodeException;

@SuppressWarnings("squid:MaximumInheritanceDepth")
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,
        reason = "Error while generating appeal pdf")
public class PdfGenerationException extends UnknownErrorCodeException {
    public PdfGenerationException(String message, Throwable cause) {
        super(AlertLevel.P4, cause);
    }
}
