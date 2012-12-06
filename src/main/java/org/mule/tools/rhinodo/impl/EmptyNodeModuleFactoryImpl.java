/**
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.tools.rhinodo.impl;

import org.mule.tools.rhinodo.api.NodeModule;
import org.mule.tools.rhinodo.api.NodeModuleFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmptyNodeModuleFactoryImpl implements NodeModuleFactory {

    private List<NodeModule> nodeModules = new ArrayList<NodeModule>();

    @Override
    public Collection<? extends NodeModule> getModules() {
        return nodeModules;
    }
}