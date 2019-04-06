package study.huhao.demo.domain.models.blog.exceptions;

import study.huhao.demo.domain.models.base.excpetions.AggregateException;

public class NoNeedToPublishException extends AggregateException {
    public NoNeedToPublishException() {
        super("no need to publish");
    }
}
