package sms.student_management_system.entity.enums;

public enum EducationType {
    QIYABI("Qiyabi"),
    EYANI("Eyani");

    private final String displayName;

    EducationType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
