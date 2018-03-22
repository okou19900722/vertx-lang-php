package io.vertx.php.ext.web.handler;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.lang.jphp.IWrapper;
import io.vertx.php.ext.web.RoutingContext;
@Name("CookieHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
public interface CookieHandler<S extends io.vertx.ext.web.handler.CookieHandler> extends IWrapper<S>{

    @Signature
    default void handle(Environment __env__, Memory... args) {
        this.getWrappedObject().handle(event)
    }
    
    @Signature
    static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, CookieHandlerImpl::new, io.vertx.ext.web.handler.CookieHandler.create()
    }

}
