package org.otcl.test.dto;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ContractEmployee createContractEmployee() {
        return new ContractEmployee();
    }

    public PermanentEmployee createPermanentEmployee() {
        return new PermanentEmployee();
    }

}
