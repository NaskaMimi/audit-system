package ru.rv.system;

public final class Constants
{
    public static final String JAX_RS_APPLICATION_ROOT_PATH = "/rest";
    public static final String JAX_RS_RESOURCE_AUDIT_PATH = "/audit";
    public static final String LOAD_RULES_PATH = "/rule";
    public static final String RULE_ID = "ruleId";
    public static final String LOAD_RULE_PATH = LOAD_RULES_PATH + "/{" + RULE_ID + "}";

    private Constants() {}
}
