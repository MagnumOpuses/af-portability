package se.arbetsformedlingen.matchning.portability.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkLifeCycleType", propOrder = {

})
public class WorkLifeCycleType {

    protected ContractType contract;
    protected HireType hire;
    protected TerminationType termination;
    protected LeaveType leaveOfAbsence;
    protected RecruitingAndStaffingType recruitingAndStaffing;

    public ContractType getContract() {
        return contract;
    }

    public void setContract(ContractType contract) {
        this.contract = contract;
    }

    public HireType getHire() {
        return hire;
    }

    public void setHire(HireType hire) {
        this.hire = hire;
    }

    public TerminationType getTermination() {
        return termination;
    }

    public void setTermination(TerminationType termination) {
        this.termination = termination;
    }

    public LeaveType getLeaveOfAbsence() {
        return leaveOfAbsence;
    }

    public void setLeaveOfAbsence(LeaveType leaveOfAbsence) {
        this.leaveOfAbsence = leaveOfAbsence;
    }

    public RecruitingAndStaffingType getRecruitingAndStaffing() {
        return recruitingAndStaffing;
    }

    public void setRecruitingAndStaffing(RecruitingAndStaffingType recruitingAndStaffing) {
        this.recruitingAndStaffing = recruitingAndStaffing;
    }
}
