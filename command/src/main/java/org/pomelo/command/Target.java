package org.pomelo.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@NoArgsConstructor
public abstract class Target {

    Logger logger = LoggerFactory.getLogger(Target.class);

    protected Size size;

    protected Boolean flag;

    @Override
    public abstract String toString();

    public void printStatus(){
        logger.info("{} [size={} flag={}]", this, size, flag);
    }

}
