package SoftwareDev.springdasar.Scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {

    private List<Object> objectList = new ArrayList<>(2);
    private Long counter = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;

        if(objectList.size()==2){
            int index = (int)(counter%2);
            return objectList.get(index);
        }else{
            Object object = objectFactory.getObject();
            objectList.add(object);
            return object;
        }
    }

    @Override
    public Object remove(String name) {
        if(!objectList.isEmpty()){
            return objectList.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
