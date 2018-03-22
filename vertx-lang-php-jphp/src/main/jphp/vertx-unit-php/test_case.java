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

package io.vertx.php.ext.unit;
import io.vertx.lang.php.util.Wrapper;
import io.vertx.php.ext.unit.TestContext;

/**
 A test case object can be used to create a single test.

 * @class
 */
@Name("TestCase")
@Namespace("io\\vertx\\php\\ext\\unit")
public class TestCase extends BaseWrapper<TestCase>{

  // A reference to the underlying Java delegate
  // NOTE! This is an internal API and must not be used in user code.
  // If you rely on this property your code is likely to break if we change it / remove it without warning.
  this._jdel = j_testCase;
};

TestCase._jclass = utils.getJavaClass("io.vertx.ext.unit.TestCase");
TestCase._jtype = {
  accept: function(obj) {
    return TestCase._jclass.isInstance(obj._jdel);
  },
  wrap: function(jdel) {
    var obj = Object.create(TestCase.prototype, {});
    TestCase.apply(obj, arguments);
    return obj;
  },
  unwrap: function(obj) {
    return obj._jdel;
  }
};
TestCase._create = function(jdel) {
  var obj = Object.create(TestCase.prototype, {});
  TestCase.apply(obj, arguments);
  return obj;
}
/**
 Create a test case.

 @memberof module:vertx-unit-js/test_case
 @param name {string} the test case name 
 @param testCase {function} the test case 
 @return {TestCase} the created test case
 */
TestCase.create = function(name, testCase) {
  var __args = arguments;
  if (__args.length === 2 && typeof __args[0] === 'string' && typeof __args[1] === 'function') {
    return utils.convReturnVertxGen(TestCase, JTestCase.create(name, function(jVal) {
    testCase(utils.convReturnVertxGen(TestContext, jVal));
  }));
  } else throw new TypeError('function invoked with invalid arguments');
};

module.exports = TestCase;