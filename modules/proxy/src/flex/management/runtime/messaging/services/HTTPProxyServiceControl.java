/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package flex.management.runtime.messaging.services;

import flex.management.BaseControl;
import flex.messaging.services.HTTPProxyService;

/**
 * @exclude
 * The <code>HTTPProxyServiceControl</code> class is the MBean implementation
 * for monitoring and managing a <code>HTTPProxyService</code> at runtime.
 *
 * @author shodgson
 */
public class HTTPProxyServiceControl extends ServiceControl implements
        HTTPProxyServiceControlMBean
{
    private static final String TYPE = "HTTPProxyService";

    /**
     * Constructs a <code>HTTPProxyServiceControl</code>, assigning its id, managed
     * HTTP proxy service and parent MBean.
     *
     * @param service The <code>HTTPProxyService</code> managed by this MBean.
     * @param parent The parent MBean in the management hierarchy.
     */
    public HTTPProxyServiceControl(HTTPProxyService service, BaseControl parent)
    {
        super(service, parent);
    }


    /**
     * @exclude
     *  (non-Javadoc)
     * @see flex.management.BaseControlMBean#getType()
     */
    public String getType()
    {
        return TYPE;
    }
}
