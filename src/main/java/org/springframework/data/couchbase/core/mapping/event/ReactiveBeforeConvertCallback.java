/*
 * Copyright 2021-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.couchbase.core.mapping.event;

import org.reactivestreams.Publisher;
import org.springframework.data.mapping.callback.EntityCallback;

/**
 * Callback being invoked before a domain object is converted to be persisted.
 *
 * @author Jorge Rodríguez Martín
 * @author Mico Piira
 * @see org.springframework.data.mapping.callback.ReactiveEntityCallbacks
 * @since 4.2
 */
@FunctionalInterface
public interface ReactiveBeforeConvertCallback<T> extends EntityCallback<T> {
	/**
	 * Entity callback method invoked before a domain object is converted to be persisted.
	 *
	 * @param entity the domain object to save.
	 * @param collection name of the collection.
	 * @return the domain object to be persisted.
	 */
	Publisher<T> onBeforeConvert(T entity, String collection);
}
