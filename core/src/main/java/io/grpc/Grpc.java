/*
 * Copyright 2016, Google Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *    * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 *    * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package io.grpc;

import io.grpc.Attributes;

import java.net.SocketAddress;
import javax.net.ssl.SSLSession;

/**
 * Stuff that are part of the public API but are not bound to particular classes, e.g., static
 * methods, constants, attribute and context keys.
 */
public final class Grpc {
  private Grpc() {
  }

  /**
   * Attribute key for the remote address of a transport.
   */
  @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1710")
  public static final Attributes.Key<SocketAddress> TRANSPORT_ATTR_REMOTE_ADDR =
          Attributes.Key.of("remote-addr");

  /**
   * Attribute key for SSL session of a transport.
   */
  @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1710")
  public static final Attributes.Key<SSLSession> TRANSPORT_ATTR_SSL_SESSION =
          Attributes.Key.of("ssl-session");
}
