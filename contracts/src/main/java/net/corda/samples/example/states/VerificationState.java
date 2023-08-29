package net.corda.samples.example.states;
import net.corda.core.contracts.ContractState;
import net.corda.samples.example.contracts.VerificationContract;
import net.corda.core.contracts.BelongsToContract;
import net.corda.core.contracts.LinearState;
import net.corda.core.contracts.UniqueIdentifier;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;

import java.util.Arrays;
import java.util.List;
@BelongsToContract(VerificationContract.class)
public class VerificationState implements ContractState, LinearState {
    private final String answer;
    private final Party sender;
    private final Party recipient;
    private final String percentDamage;
    private final UniqueIdentifier linearId;


    public VerificationState(String answer, Party sender, Party recipient, String percentDamage, UniqueIdentifier linearId) {
        this.answer = answer;
        this.sender = sender;
        this.recipient = recipient;
        this.percentDamage=percentDamage;
        this.linearId = linearId;

    }

    public String getAnswer() {
        return answer;
    }



    public Party getSender() {
        return sender;
    }



    public Party getRecipient() {
        return recipient;
    }
    public String getPercentDamage(){
        return percentDamage;
    }

    @Override
    public UniqueIdentifier getLinearId() { return linearId; }



    @Override
    public List<AbstractParty> getParticipants() {
        return Arrays.asList(sender, recipient);
    }

    @Override
    public String toString() {
        return "MessageState{" +
                "msgUpdate='" + answer + '\'' +
                ", msgSender=" + sender +
                ", msgReceiver=" + recipient +
                ", percentDamage=" + percentDamage +
                ", uniqId=" + linearId +
                '}';
    }

    //    public void setMsgUpdate(String msgUpdate) {
//        this.msgUpdate = msgUpdate;
//    }
//
//    public void setMsgSender(Party msgSender) {
//        this.msgSender = msgSender;
//    }
//
//    public void setMsgReceiver(Party msgReceiver) {
//        this.msgReceiver = msgReceiver;
//    }

}
