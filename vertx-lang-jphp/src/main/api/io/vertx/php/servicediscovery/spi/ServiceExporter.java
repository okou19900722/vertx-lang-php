package io.vertx.php.servicediscovery.spi;
import io.vertx.core.json.JsonObject;
import io.vertx.lang.jphp.Utils;
import io.vertx.lang.jphp.converter.TypeConverter;
import io.vertx.lang.jphp.wrapper.VertxGenVariable0Wrapper;
import io.vertx.php.core.Future;
import io.vertx.php.core.Vertx;
import io.vertx.php.servicediscovery.Record;
import java.lang.Void;
import php.runtime.Memory;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
@Name("ServiceExporter")
@Namespace("io\\vertx\\php\\servicediscovery\\spi")
@SuppressWarnings("ALL")
public class ServiceExporter extends VertxGenVariable0Wrapper<io.vertx.servicediscovery.spi.ServiceExporter>{
    
    private ServiceExporter(Environment env, io.vertx.servicediscovery.spi.ServiceExporter wrappedObject){
        super(env, wrappedObject);
    }
    public static  ServiceExporter __create(Environment env, io.vertx.servicediscovery.spi.ServiceExporter wrappedObject){
        return new ServiceExporter(env, wrappedObject);
    }

    @Signature
    public void init(Environment __ENV__, Memory arg0, Memory arg1, Memory arg2, Memory arg3) {
        if(Utils.isNotNull(arg0) && Utils.isVertxGen(io.vertx.core.Vertx.class, Vertx.class, arg0) && Utils.isNotNull(arg1) && Utils.isVertxGen(io.vertx.servicediscovery.spi.ServicePublisher.class, ServicePublisher.class, arg1) && Utils.isNotNull(arg2) && Utils.isJsonObject(__ENV__, arg2) && Utils.isNotNull(arg3) && Utils.isVertxGen(io.vertx.core.Future.class, Future.class, arg3)) {
            this.getWrappedObject().init(Utils.  <io.vertx.core.Vertx, Vertx  >convParamVertxGenVariable0(__ENV__, Vertx.class, Vertx::__create, arg0), Utils.  <io.vertx.servicediscovery.spi.ServicePublisher, ServicePublisher  >convParamVertxGenVariable0(__ENV__, ServicePublisher.class, ServicePublisher::__create, arg1), Utils.convParamJsonObject(__ENV__, arg2), Utils.  <io.vertx.core.Future<Void>, Future<Void>  , Void  >convParamVertxGenVariable1(__ENV__, Future.class, Future::__create,  TypeConverter.VOID, arg3));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void onPublish(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0)) {
            this.getWrappedObject().onPublish(Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void onUpdate(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0)) {
            this.getWrappedObject().onUpdate(Utils.convParamDataObject(__ENV__, io.vertx.servicediscovery.Record.class, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void onUnpublish(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isString(__ENV__, arg0)) {
            this.getWrappedObject().onUnpublish(Utils.convParamString(__ENV__, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

    @Signature
    public void close(Environment __ENV__, Memory arg0) {
        if(Utils.isNotNull(arg0) && Utils.isHandler(__ENV__, arg0)) {
            this.getWrappedObject().close(Utils.convParamHandler(__ENV__, TypeConverter.VOID, arg0));
        }/*2*/ else {
            throw new RuntimeException("function invoked with invalid arguments");
        }
    }/*1*/

}
