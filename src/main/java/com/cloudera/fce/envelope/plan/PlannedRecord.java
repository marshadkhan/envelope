package com.cloudera.fce.envelope.plan;

import org.apache.avro.generic.GenericData.Record;
import org.apache.avro.generic.GenericRecord;

public class PlannedRecord extends Record {
    
    private MutationType mutationType;

    public PlannedRecord(GenericRecord existing, MutationType mutationType) {
        super((Record)existing, true);
        setMutationType(mutationType);
    }
    
    public MutationType getMutationType() {
        return mutationType;
    }
    
    public void setMutationType(MutationType mutationType) {
        this.mutationType = mutationType;
    }
    
}