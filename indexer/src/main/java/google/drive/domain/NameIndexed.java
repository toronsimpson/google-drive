package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class NameIndexed extends AbstractEvent {

    private Long id;

    public NameIndexed(Index aggregate) {
        super(aggregate);
    }

    public NameIndexed() {
        super();
    }
}
