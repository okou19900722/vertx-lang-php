package io.vertx.php.ext.auth.oauth2.providers.impl;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import io.vertx.php.ext.auth.oauth2.providers.DropboxAuth;
import io.vertx.lang.jphp.VertxGenWrapper;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.ObjectMemory;
import php.runtime.reflection.ClassEntity;
@Name("DropboxAuthImpl")
@Namespace("io\\vertx\\php\\ext\\auth\\oauth2\\providers\\impl")
public class DropboxAuthImpl extends VertxGenWrapper<io.vertx.ext.auth.oauth2.providers.DropboxAuth> implements DropboxAuth<io.vertx.ext.auth.oauth2.providers.DropboxAuth>{
    
    public DropboxAuthImpl(Environment env, io.vertx.ext.auth.oauth2.providers.DropboxAuth wrappedObject){
        super(env, wrappedObject);
    }

    @Signature
    public static Memory create(Environment __env__, Memory... args) {
        return Utils.convReturnVertxGen(__env__, OAuth2AuthImpl::new, io.vertx.ext.auth.oauth2.providers.DropboxAuth.create(vertx, clientId, clientSecret)
    }

}
