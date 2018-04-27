#!/usr/bin/env bash
curl https://youtrack.jetbrains.com/rest/issue/byproject/KT?filter=%28%23Submitted+OR+%28%28%23IDE+OR+%23Tools%29+AND+%23Unresolved%29+OR+%28%28%23%7BIDE.%2A%7D+OR+%23%7BTools.%2A%7D%29+AND+%23%7BNo+Priority%7D+AND+%23Unresolved%29%29+AND+%28updated%3A+2018-04-23T12%3A00+..+Today%29\&max=1000 --silent --user $YOUTRACK_USER:$YOUTRACK_PASSWORD > issues.xml
