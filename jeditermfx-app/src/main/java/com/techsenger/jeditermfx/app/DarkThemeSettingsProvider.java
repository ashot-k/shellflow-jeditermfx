
package com.techsenger.jeditermfx.app;

import com.techsenger.jeditermfx.core.TerminalColor;
import com.techsenger.jeditermfx.ui.settings.DefaultSettingsProvider;


public class DarkThemeSettingsProvider extends DefaultSettingsProvider {

    @Override
    public TerminalColor getDefaultBackground() {
        return new TerminalColor(0, 0, 0);
    }

    @Override
    public TerminalColor getDefaultForeground() {
        return new TerminalColor(255, 255, 255);
    }
}
