package org.protege.editor.core.ui.view;

import org.protege.editor.core.ui.action.ProtegeAction;


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Mar 29, 2006<br><br>

 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 */
public abstract class ViewAction extends ProtegeAction {

    private View view;


    public View getView() {
        return view;
    }


    public void setView(View view) {
        this.view = view;
    }
}
