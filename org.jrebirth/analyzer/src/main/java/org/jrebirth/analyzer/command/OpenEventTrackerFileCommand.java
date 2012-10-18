/**
 * Copyright JRebirth.org © 2011-2012 
 * Contact : sebastien.bordes@jrebirth.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.analyzer.command;

import java.io.File;

import javafx.stage.FileChooser;

import org.jrebirth.analyzer.service.LoadEdtFileService;
import org.jrebirth.analyzer.ui.editor.EditorWaveItem;
import org.jrebirth.core.command.DefaultUICommand;
import org.jrebirth.core.wave.Wave;
import org.jrebirth.core.wave.WaveData;

/**
 * The class <strong>OpenEventTrackerFileCommand</strong>.
 * 
 * @author Sébastien Bordes
 */
public final class OpenEventTrackerFileCommand extends DefaultUICommand {

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(final Wave wave) {

        final FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("(etd)", "*.etd")); // to filter
                                                                                         // only xml
                                                                                         // files
        final File selected = fc.showOpenDialog(null);

        if (selected != null) { // if nothing is selected
            // Process the file
            // getService(LoadEdtFileService.class).processEventFile(selected);

            returnData(LoadEdtFileService.class, new WaveData(EditorWaveItem.EVENTS_FILE, selected));

        }
    }

}
