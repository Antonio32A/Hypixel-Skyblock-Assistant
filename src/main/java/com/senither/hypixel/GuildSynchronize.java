/*
 * Copyright (c) 2019.
 *
 * This file is part of Hypixel Guild Synchronizer.
 *
 * Hypixel Guild Synchronizer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Hypixel Guild Synchronizer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Hypixel Guild Synchronizer.  If not, see <https://www.gnu.org/licenses/>.
 *
 *
 */

package com.senither.hypixel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class GuildSynchronize {

    private static final Logger log = LoggerFactory.getLogger(GuildSynchronize.class);

    private final Configuration configuration;

    GuildSynchronize(Configuration configuration) {
        this.configuration = configuration;

        log.info(configuration.getHypixelToken());
        log.info(configuration.getDiscordToken());
    }
}
