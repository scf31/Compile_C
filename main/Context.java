package main;

import java.util.HashMap;


/**
 * Created by max on 08.12.2014.
 */
public class Context {



    public Context parentContext;

    private HashMap<String, SemanticChecker.Identifier> identifiers = new HashMap<String, SemanticChecker.Identifier>();

    private SemanticChecker.Identifier function = null;



    public Context(Context parentContext) {

        this.parentContext = parentContext;

    }



    public SemanticChecker.Identifier getIdentifier(String name) {

        if (identifiers.containsKey(name))

            return identifiers.get(name);

        else {

            if (parentContext != null)

                return parentContext.getIdentifier(name);

            else

                return null;

        }

    }



    public void setIdentifier(String name, SemanticChecker.Identifier value) {

        identifiers.put(name, value);

    }



    public SemanticChecker.Identifier InThisContext(String name) {

        if (identifiers.containsKey(name)) {

            return identifiers.get(name);

        } else {

            return null;

        }

    }



    public SemanticChecker.Identifier getFunction() {

        if (function != null) {

            return function;

        } else {

            if (parentContext != null) {

                return parentContext.function;

            } else {

                return null;

            }

        }

    }



    public void setFunction(SemanticChecker.Identifier function) {

        this.function = function;

    }



    public Context getParentContext() {

        return parentContext;

    }

}
