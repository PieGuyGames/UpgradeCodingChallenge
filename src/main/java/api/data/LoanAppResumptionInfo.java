package api.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoanAppResumptionInfo {

	private Integer loanAppId;
	private String loanAppUuid;
	private String referrer;
	private String status;
	private String productType;
	private String sourceSystem;
	private Double desiredAmount;
	private BorrowerResumptionInfo borrowerResumptionInfo;
	private Object coBorrowerResumptionInfo;
	private Boolean turnDown;
	private Boolean hasLogin;
	private List<Object> availableAppImprovements = null;
	private Object cashOutAmount;
	private Boolean canAddCollateral;
	private Object rewardProgramId;
	private Object rewardProgramCode;
	private Object addon;
	private Object isMobileDiscountApplied;
	private Boolean checkingDiscountAvailable;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getLoanAppId() {
		return loanAppId;
	}

	public void setLoanAppId(Integer loanAppId) {
		this.loanAppId = loanAppId;
	}

	public String getLoanAppUuid() {
		return loanAppUuid;
	}

	public void setLoanAppUuid(String loanAppUuid) {
		this.loanAppUuid = loanAppUuid;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public Double getDesiredAmount() {
		return desiredAmount;
	}

	public void setDesiredAmount(Double desiredAmount) {
		this.desiredAmount = desiredAmount;
	}

	public BorrowerResumptionInfo getBorrowerResumptionInfo() {
		return borrowerResumptionInfo;
	}

	public void setBorrowerResumptionInfo(BorrowerResumptionInfo borrowerResumptionInfo) {
		this.borrowerResumptionInfo = borrowerResumptionInfo;
	}

	public Object getCoBorrowerResumptionInfo() {
		return coBorrowerResumptionInfo;
	}

	public void setCoBorrowerResumptionInfo(Object coBorrowerResumptionInfo) {
		this.coBorrowerResumptionInfo = coBorrowerResumptionInfo;
	}

	public Boolean getTurnDown() {
		return turnDown;
	}

	public void setTurnDown(Boolean turnDown) {
		this.turnDown = turnDown;
	}

	public Boolean getHasLogin() {
		return hasLogin;
	}

	public void setHasLogin(Boolean hasLogin) {
		this.hasLogin = hasLogin;
	}

	public List<Object> getAvailableAppImprovements() {
		return availableAppImprovements;
	}

	public void setAvailableAppImprovements(List<Object> availableAppImprovements) {
		this.availableAppImprovements = availableAppImprovements;
	}

	public Object getCashOutAmount() {
		return cashOutAmount;
	}

	public void setCashOutAmount(Object cashOutAmount) {
		this.cashOutAmount = cashOutAmount;
	}

	public Boolean getCanAddCollateral() {
		return canAddCollateral;
	}

	public void setCanAddCollateral(Boolean canAddCollateral) {
		this.canAddCollateral = canAddCollateral;
	}

	public Object getRewardProgramId() {
		return rewardProgramId;
	}

	public void setRewardProgramId(Object rewardProgramId) {
		this.rewardProgramId = rewardProgramId;
	}

	public Object getRewardProgramCode() {
		return rewardProgramCode;
	}

	public void setRewardProgramCode(Object rewardProgramCode) {
		this.rewardProgramCode = rewardProgramCode;
	}

	public Object getAddon() {
		return addon;
	}

	public void setAddon(Object addon) {
		this.addon = addon;
	}

	public Object getIsMobileDiscountApplied() {
		return isMobileDiscountApplied;
	}

	public void setIsMobileDiscountApplied(Object isMobileDiscountApplied) {
		this.isMobileDiscountApplied = isMobileDiscountApplied;
	}

	public Boolean getCheckingDiscountAvailable() {
		return checkingDiscountAvailable;
	}

	public void setCheckingDiscountAvailable(Boolean checkingDiscountAvailable) {
		this.checkingDiscountAvailable = checkingDiscountAvailable;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
