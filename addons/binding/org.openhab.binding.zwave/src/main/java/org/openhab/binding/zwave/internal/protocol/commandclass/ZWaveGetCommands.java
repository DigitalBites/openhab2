/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zwave.internal.protocol.commandclass;

import org.openhab.binding.zwave.internal.protocol.SerialMessage;

/**
 * Interface to implement for all command classes that implement the Get command.
 * 
 * @author Chris Jackson
 * @author Jan-Willem Spuij
 */
public interface ZWaveGetCommands {
    /**
     * Gets a SerialMessage with the GET command
     * 
     * @return the serial message
     */
    public SerialMessage getValueMessage();
}
