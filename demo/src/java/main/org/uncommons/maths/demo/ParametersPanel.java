// ============================================================================
//   Copyright 2006-2012 Daniel W. Dyer
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
// ============================================================================
package org.uncommons.maths.demo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * @author Daniel Dyer
 */
abstract class ParametersPanel extends JPanel
{
    private static final long serialVersionUID = 3278614718971993661L;

    protected ParametersPanel()
    {
        super(new BorderLayout());
    }


    public abstract ProbabilityDistribution createProbabilityDistribution();
}
