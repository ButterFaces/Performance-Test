package de.larmic.butterfaces.performance;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@SessionScoped
@Named
public class IndexBean implements Serializable {

    private final List<ListItem> items = new ArrayList<>();
    
    @PostConstruct
    public void init() {
        IntStream.range(0, 9000).forEach(
                index -> items.add(new ListItem("name" + index, "description" + index))
        );
    }

    public List<ListItem> getItems() {
        return items;
    }
}
