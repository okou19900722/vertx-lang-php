package io.vertx.php.ext.web.sstore.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.web.sstore.SessionStore;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("SessionStoreImpl")
@Namespace("io\\vertx\\php\\ext\\web\\sstore\\impl")
public class SessionStoreImpl extends VertxGenWrapper<io.vertx.ext.web.sstore.SessionStore> implements SessionStore<io.vertx.ext.web.sstore.SessionStore>{
    
    public SessionStoreImpl(Environment env, io.vertx.ext.web.sstore.SessionStore wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public Memory createSession(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, SessionImpl::new, this.getWrappedObject().createSession(timeout)
    }

    @Signature
    public void get(Environment __env__, Memory... args) {
        this.getWrappedObject().get(id, resultHandler)
    }

    @Signature
    public void delete(Environment __env__, Memory... args) {
        this.getWrappedObject().delete(id, resultHandler)
    }

    @Signature
    public void put(Environment __env__, Memory... args) {
        this.getWrappedObject().put(session, resultHandler)
    }

    @Signature
    public void clear(Environment __env__, Memory... args) {
        this.getWrappedObject().clear(resultHandler)
    }

    @Signature
    public void size(Environment __env__, Memory... args) {
        this.getWrappedObject().size(resultHandler)
    }

}
