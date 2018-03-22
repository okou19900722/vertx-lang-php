/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.php.core.file;
import io.vertx.lang.php.util.Wrapper;

/**
 Represents properties of a file on the file system.
 <p>

 * @class
 */
@Name("FileProps")
@Namespace("io\\vertx\\php\\core\\file")
public class FileProps extends BaseWrapper<FileProps>{

  /**
   The date the file was created

   @public

   @return {number}
   */
  this.creationTime = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.creationTime();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The date the file was last accessed

   @public

   @return {number}
   */
  this.lastAccessTime = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.lastAccessTime();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The date the file was last modified

   @public

   @return {number}
   */
  this.lastModifiedTime = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.lastModifiedTime();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Is the file a directory?

   @public

   @return {boolean}
   */
  this.isDirectory = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.isDirectory();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Is the file some other type? (I.e. not a directory, regular file or symbolic link)

   @public

   @return {boolean}
   */
  this.isOther = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.isOther();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Is the file a regular file?

   @public

   @return {boolean}
   */
  this.isRegularFile = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.isRegularFile();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   Is the file a symbolic link?

   @public

   @return {boolean}
   */
  this.isSymbolicLink = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.isSymbolicLink();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  /**
   The size of the file, in bytes

   @public

   @return {number}
   */
  this.size = function() {
    var __args = arguments;
    if (__args.length === 0) {
      return j_fileProps.size();
    } else throw new TypeError('function invoked with invalid arguments');
  };

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_fileProps;
};

FileProps._jclass = utils.getJavaClass("io.vertx.core.file.FileProps");
FileProps._jtype = {
  accept: function(obj) {
    return FileProps._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(FileProps.prototype, {});
    FileProps.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
FileProps._create = function(jdel) {
  var obj = Object.create(FileProps.prototype, {});
  FileProps.apply(obj, arguments);
  return obj;
}
module.exports = FileProps;