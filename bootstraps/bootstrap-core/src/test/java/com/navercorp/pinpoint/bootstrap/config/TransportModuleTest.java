/*
 * Copyright 2019 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.bootstrap.config;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Woonduk Kang(emeroad)
 */
public class TransportModuleTest {

    @Test
    public void parse() {
        Assert.assertEquals(TransportModule.parse("GRPC"), TransportModule.GRPC);
        Assert.assertEquals(TransportModule.parse("THRIFT"), TransportModule.THRIFT);

        Assert.assertNull(TransportModule.parse("ERROR"));
    }

    @Test
    public void parse1() {
        Assert.assertEquals(TransportModule.parse("ERROR", TransportModule.GRPC), TransportModule.GRPC);
    }
}