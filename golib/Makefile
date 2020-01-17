GOMOBILE=gomobile
GOBIND=$(GOMOBILE) bind
BUILDDIR=$(shell pwd)/output

LDFLAGS=-s -w

all: ios android

android:
	mkdir -p $(BUILDDIR)
	# GO111MODULE=off $(GOBIND) -a -trimpath -ldflags "$(LDFLAGS)" -target=android -o $(BUILDDIR)/golib.aar
	go mod vendor
	$(GOBIND) -a -trimpath -ldflags "$(LDFLAGS)" -target=android -o $(BUILDDIR)/golib.aar
	cp $(BUILDDIR)/*.jar $(BUILDDIR)/*.aar ../android/app/libs/

clean:
	rm -rf $(BUILDDIR)
