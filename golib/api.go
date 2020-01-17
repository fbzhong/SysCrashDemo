package golib

import (
	"golang.org/x/sys/cpu"
)

func Init(appName, appVersion string) bool {
	return cpu.Initialized
}
