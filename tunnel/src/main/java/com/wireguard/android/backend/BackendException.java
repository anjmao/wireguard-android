/*
 * Copyright © 2020 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.wireguard.android.backend;

import androidx.annotation.Nullable;

public class BackendException extends Exception {
    private final Reason reason;

    public BackendException(final Reason reason, @Nullable final Throwable cause) {
        super(cause);
        this.reason = reason;
    }

    public Reason getReason() {
        return reason;
    }

    public enum Reason {
        MULTIPLE_TUNNELS,
        NO_CONFIG,
        VPN_NOT_AUTHORIZED,
        VPN_START_ERROR,
        TUN_CREATE_ERROR,
        TUNNEL_ON_ERROR
    }
}
