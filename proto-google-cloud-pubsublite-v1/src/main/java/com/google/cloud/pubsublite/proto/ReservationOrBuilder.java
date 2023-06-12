/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/common.proto

package com.google.cloud.pubsublite.proto;

public interface ReservationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.pubsublite.v1.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the reservation.
   * Structured like:
   * projects/{project_number}/locations/{location}/reservations/{reservation_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the reservation.
   * Structured like:
   * projects/{project_number}/locations/{location}/reservations/{reservation_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The reserved throughput capacity. Every unit of throughput capacity is
   * equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed
   * messages.
   *
   * Any topics which are declared as using capacity from a Reservation will
   * consume resources from this reservation instead of being charged
   * individually.
   * </pre>
   *
   * <code>int64 throughput_capacity = 2;</code>
   *
   * @return The throughputCapacity.
   */
  long getThroughputCapacity();
}
