/*
 * Copyright 2017 michael-simons.eu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ac.simons.simplemeetup.app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Thrown when a valid resource couldn't be assembled.
 *
 * @author Michael J. Simons, 2017-12-08
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InvalidResourceException extends IllegalStateException {

    private static final long serialVersionUID = -1552515182927108171L;
}
