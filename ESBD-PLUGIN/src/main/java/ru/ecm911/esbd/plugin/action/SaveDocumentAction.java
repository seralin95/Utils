package ru.ecm911.esbd.plugin.action;

import com.ibm.ecm.extension.PluginAction;
import ru.ecm911.esbd.plugin.menu.ContractPaneMenuType;
import ru.ecm911.esbd.plugin.menu.ContractWithPolicePaneMenuType;
import ru.ecm911.esbd.plugin.menu.DocumentMenuType;

import java.util.Locale;

public class SaveDocumentAction extends PluginAction {

    public static String Id = "ESBDSaveDocumentAction" ;

    @Override
    public String getId() {

        return SaveDocumentAction.Id;

    }

    @Override
    public String getName(Locale locale) {

        return "Сохранить";

    }

    @Override
    public String getIcon() {

        return null ;

    }

    @Override
    public String getPrivilege() {

        return "privEditProperties";

    }

    @Override
    public boolean isMultiDoc() {

        return false;

    }

    @Override
    public boolean isGlobal() {

        return false;

    }

    @Override
    public String getActionFunction() {

        return SaveDocumentAction.Id ;

    }

    @Override
    public String getServerTypes() {

        return "p8";

    }

    @Override
    public String[] getMenuTypes() {

        return new String[]{

                DocumentMenuType.Id,
                ContractWithPolicePaneMenuType.ID,
                ContractPaneMenuType.ID

        };

    }

    @Override
    public String getActionModelClass() {

        return "esbd.DocumentAction";

    }

}
