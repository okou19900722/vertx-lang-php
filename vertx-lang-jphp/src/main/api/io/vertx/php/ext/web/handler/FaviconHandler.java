package io.vertx.php.ext.web.handler;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.ext.web.RoutingContext;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("FaviconHandler")
@Namespace("io\\vertx\\php\\ext\\web\\handler")
@SuppressWarnings("ALL")
public class FaviconHandler extends VertxGenVariable0Wrapper<io.vertx.ext.web.handler.FaviconHandler>{
    
    private FaviconHandler(Environment env, io.vertx.ext.web.handler.FaviconHandler wrappedObject){
        super(env, wrappedObject);
    }
    public static  FaviconHandler __create(Environment env, io.vertx.ext.web.handler.FaviconHandler wrappedObject){
        return new FaviconHandler(env, wrappedObject);
    }

    @Signature
    public void handle(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.ext.web.RoutingContext.class, RoutingContext.class, arg0)) {
            this.getWrappedObject().handle(Utils.  <io.vertx.ext.web.RoutingContext, RoutingContext  >convParamVertxGenVariable0(__ENV__, RoutingContext.class, RoutingContext::__create, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public static Memory create(Environment __ENV__) {
        return Utils.<io.vertx.ext.web.handler.FaviconHandler, FaviconHandler>convReturnVertxGenVariable0(__ENV__, FaviconHandler.class, FaviconHandler::__create, io.vertx.ext.web.handler.FaviconHandler.create());
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.handler.FaviconHandler, FaviconHandler>convReturnVertxGenVariable0(__ENV__, FaviconHandler.class, FaviconHandler::__create, io.vertx.ext.web.handler.FaviconHandler.create(Utils.convParamString(__ENV__, arg0)));
        } else if(Utils.isNotNull(arg0) && Utils.isLong(__ENV__, arg0)) {
            return Utils.<io.vertx.ext.web.handler.FaviconHandler, FaviconHandler>convReturnVertxGenVariable0(__ENV__, FaviconHandler.class, FaviconHandler::__create, io.vertx.ext.web.handler.FaviconHandler.create(Utils.convParamLong(__ENV__, arg0)));
        }/*3*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*4*/

    @Signature
    public static Memory create(Environment __ENV__, Memory arg0, Memory arg1) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0) && Utils.isNotNull(arg1) && Utils.isLong(__ENV__, arg1)) {
            return Utils.<io.vertx.ext.web.handler.FaviconHandler, FaviconHandler>convReturnVertxGenVariable0(__ENV__, FaviconHandler.class, FaviconHandler::__create, io.vertx.ext.web.handler.FaviconHandler.create(Utils.convParamString(__ENV__, arg0), Utils.convParamLong(__ENV__, arg1)));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
