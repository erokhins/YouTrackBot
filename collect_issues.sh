#!/usr/bin/env bash
curl https://youtrack.jetbrains.com/rest/issue/byproject/KT?filter=State:Submitted\&max=1000 --silent > issues.xml
