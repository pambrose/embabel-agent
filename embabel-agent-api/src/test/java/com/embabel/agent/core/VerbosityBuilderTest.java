/*
 * Copyright 2024-2025 Embabel Software, Inc.
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
package com.embabel.agent.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VerbosityBuilderTest {

    @Test
    void builder() {
        var verbosity = Verbosity.builder()
                .showPrompts(true)
                .showLlmResponses(true)
                .debug(true)
                .showPlanning(true)
                .build();

        assertTrue(verbosity.getShowPrompts());
        assertTrue(verbosity.getShowLlmResponses());
        assertTrue(verbosity.getDebug());
        assertTrue(verbosity.getShowPlanning());
    }

}