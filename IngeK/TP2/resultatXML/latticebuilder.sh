#!/bin/bash

for i in {0..2};
do
    for j in {0..1};
    do
	   dot -Tpdf step$i-$j.dot -o step$i-$j.pdf;
	   pdfcrop step$i-$j.pdf step$i-$j.pdf
    done
done