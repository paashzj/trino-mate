#!/bin/bash

mkdir /opt/sh/trino/logs

java -Xmx128M -Xms128M -XX:MaxDirectMemorySize=256M -jar /opt/sh/trino/mate/trino-mate.jar >>/opt/sh/trino/logs/trino_mate.stdout.log 2>>/opt/sh/trino/logs/trino_mate.stderr.log
tail -f /dev/null