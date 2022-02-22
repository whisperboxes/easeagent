/*
 * Copyright (c) 2021, MegaEase
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.megaease.easeagent.plugin.springweb.reactor;

import org.reactivestreams.Subscription;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.CoreSubscriber;

import java.util.concurrent.atomic.AtomicBoolean;

public class MockCoreSubscriber implements CoreSubscriber<ClientResponse> {
    protected final AtomicBoolean onSubscribe = new AtomicBoolean(false);
    protected final AtomicBoolean onNext = new AtomicBoolean(false);
    protected final AtomicBoolean onError = new AtomicBoolean(false);
    protected final AtomicBoolean onComplete = new AtomicBoolean(false);


    @Override
    public void onSubscribe(Subscription subscription) {
        onSubscribe.set(true);
    }

    @Override
    public void onNext(ClientResponse clientResponse) {
        onNext.set(true);
    }

    @Override
    public void onError(Throwable throwable) {
        onError.set(true);
    }

    @Override
    public void onComplete() {
        onComplete.set(true);
    }
}