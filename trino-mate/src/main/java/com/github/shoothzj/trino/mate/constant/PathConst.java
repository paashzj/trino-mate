package com.github.shoothzj.trino.mate.constant;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

/**
 * @author hezhangjian
 */
@Slf4j
public class PathConst {

    public static final String TRINO_HOME = System.getenv("TRINO_HOME");

    public static final String TRINO_MATE = TRINO_HOME + File.separator + "mate";

    public static final String TRINO_SCRIPTS = TRINO_MATE + File.separator + "scripts";

    public static final String TRINO_START_STANDALONE_SCRIPT = TRINO_SCRIPTS + File.separator + "start-trino-standalone.sh";

}
